using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using MySqlConnector;
using System.Data.SqlClient;
using Conexion;
using MySql.Data.MySqlClient;
using Personas;

namespace frmLogin
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            conexion conex = new conexion();
            

            if (conex != null) {
                conex.ConexionBD();
            }
            
        }

        private void btnRegistr_Click(object sender, EventArgs e)
        {

            if (campoVaciosVerificarRegister())
            {

                lblInformacion.Text = "LOS CAMPOS SE ENCUENTRAN VACIOS";

            }
            else if (!verificarEmailRegister())
            {

                lblInformacion.Text = "EL EMAIL NO CONTIENE @";
            }

            else if (verificarCaracteres())
            {

                lblInformacion.Text = "CAMPO EXCEDIDO A 30 CARACTERES";

            }

            else {

                Persona personaDato = new Persona();
                String nombre = txtNombre.Text;
                String email = txtEmail.Text;
                String pass = txtContra.Text;

                String mostrarLeable = "";

                personaDato = new Persona(nombre, email, pass);
                lblInformacion.Text = personaDato.ingresarDatos(personaDato, mostrarLeable);


            } 
        }

        //BOTON DE LOGIN
        private void btnIngresarlogin_Click(object sender, EventArgs e)
        {

            if (!camposVaciosVerificarLogin())
            {

                lblInformacion.Text = "UN CAMPO ESTA VACIO";

            }
            else if (verificarEmailogin())
            {

                lblInformacion.Text = "CAMPO EXCEDIDO A 30 CARACTERES";

            } else if (!verificarCaracteres()) {

                lblInformacion.Text = "EL EMAIL NO CONTIENE @";
            }
            else {

                String email = txtEmailLogin.Text;
                String pass = txtContraLogin.Text;

                Persona persona = new Persona();
                lblInformacion.Text = persona.compararLogin(email, pass);

            }
            
        }

        //METODO PARA LIMITAR LOS CARACTERES
        public Boolean camposVaciosVerificarLogin()
        {
            //ESTO ES PARA VERIFICAR SI LOS CAMPOS ESTAN VACIOS PARA EL LOGIN
            return String.IsNullOrWhiteSpace(txtEmailLogin.Text)
                || String.IsNullOrWhiteSpace(txtContraLogin.Text);
        }

        public Boolean campoVaciosVerificarRegister() {

            //ESTO ES PARA VERIFICAR SI LOS CAMPOS ESTAN VACIOS PARA EL REGISTER
            return  String.IsNullOrWhiteSpace(txtNombre.Text)
                    || String.IsNullOrWhiteSpace(txtEmail.Text)
                    || String.IsNullOrWhiteSpace(txtContra.Text);
        }

        public Boolean verificarCaracteres() {
            return(txtNombre.Text.Length > 30
                || txtEmail.Text.Length > 30
                || txtContra.Text.Length > 30
                || txtEmailLogin.Text.Length > 30
                || txtContraLogin.Text.Length > 30);
        }

        public Boolean verificarEmailRegister() {

            return txtEmail.Text.Contains("@");
        }

        public Boolean verificarEmailogin()
        {

            return txtEmailLogin.Text.Contains("@");
        }
    }
}
