using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace EjerciciosProg_Practica
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {

            //imprime del 1 al 100 en pantalla usando while.

            int numero = 0;

            while (numero >= 100) {
                numero++;
                Console.WriteLine(numero);
            }

        }
    }
}
