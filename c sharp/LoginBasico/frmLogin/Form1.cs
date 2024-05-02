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

            Persona personaDato = new Persona();

            String nombre = txtNombre.Text;
            String email = txtEmail.Text;
            String pass = txtContra.Text;

            String mostrarLeable = "";

            personaDato = new Persona(nombre,email,pass);
            lblInformacion.Text = personaDato.ingresarDatos(personaDato, mostrarLeable);
        }

        //METODO PARA LIMITAR LOS CARACTERES
        public Boolean limitarDatos() {
            return true;
        }

        //BOTON DE LOGIN
        private void btnIngresarlogin_Click(object sender, EventArgs e)
        {

            String email = txtEmailLogin.Text;
            String pass = txtContraLogin.Text;

            Persona persona = new Persona();
            lblInformacion.Text = persona.compararLogin(email,pass);
            
        }
    }
}
