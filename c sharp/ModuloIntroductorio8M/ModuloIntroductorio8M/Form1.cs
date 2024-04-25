using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ModuloIntroductorio8M
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btnCalcular_Click(object sender, EventArgs e)
        {
            int resul = calcular();

            resultadoTotal.Text = resul.ToString();
               

        }

        //METODO PARA CALCULAR LO OBTENIDO POR LOS CAMPOS DE TEXTO.
        public int calcular() {

            int num1 = int.Parse(numero1.Text);
            int num2 = int.Parse(numero2.Text);


            int result = num1 + num2;

            return result;
        }

        //BOTON QUE ELIMINA EL CONTENIDO DE LOS CHECK BOX 
        private void clear_Click(object sender, EventArgs e)
        {
            numero1.Clear();
            numero2.Clear();
            resultadoTotal.Clear();
        }
    }
}
