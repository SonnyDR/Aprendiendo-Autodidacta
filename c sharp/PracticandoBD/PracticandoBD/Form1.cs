using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Data.SqlClient;
using MySql.Data.MySqlClient;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Data;

namespace PracticandoBD
{


    public partial class Form1 : Form
    {

        Conexion conexion = new Conexion();


        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {

            Conexion conexion = new Conexion();
            using (MySqlConnection con = conexion.conexionBase())
            {
                if (con != null)
                {
                    int id = 2;
                    mostrarPorId(id);

                }
            }

        }

        private void mostrarPorId(int id) {

            using (var conn = conexion.conexionBase()) {

                if (conn != null)
                {

                    string query = "SELECT id, nombre, f_nacimiento,f_fallecimiento,nacionalidad,ocupacion,logros FROM personas WHERE id = @id";

                    using (MySqlCommand cmd = new MySqlCommand(query, conn))
                    {

                        cmd.Parameters.AddWithValue("@id", id);

                        using (MySqlDataReader reader = cmd.ExecuteReader())
                        {

                            if (reader.Read())
                            {

                                int personaId = reader.GetInt16("id");
                                string nombre = reader.GetString("nombre");
                                string fechaNacimiento = reader.GetString("f_nacimiento");
                                string fechaFallecimiento = reader.GetString("f_fallecimiento");
                                string nacionalidad = reader.GetString("nacionalidad");
                                string ocupacion = reader.GetString("ocupacion");
                                string logros = reader.GetString("logros");

                                /* Console.WriteLine($"ID: {personaId}");
                                 Console.WriteLine($"Nombre: {nombre}");
                                 Console.WriteLine($"Fecha de Nacimiento: {fechaNacimiento}");
                                 Console.WriteLine($"Fecha de Fallecimiento: {fechaFallecimiento}");
                                 Console.WriteLine($"Nacionalidad: {nacionalidad}");
                                 Console.WriteLine($"Ocupación: {ocupacion}");
                                 Console.WriteLine($"Logros: {logros}");*/

                                lblId.Text = personaId.ToString();
                                lblnombre.Text = nombre;
                                lblfnaci.Text = fechaNacimiento;
                                lblffalle.Text = fechaFallecimiento;
                                lblnacio.Text = nacionalidad;
                                lblocupacion.Text = ocupacion;
                                lbllogro.Text = logros;

                            }
                            else
                            {
                                Console.WriteLine("No se encontraron datos para el ID proporcionado.");
                            }

                        }

                    }

                }
                else {
                    Console.WriteLine("No se pudo obtenr datos de la base de datos.");
                }

            }

                

            
        }

    }

 }

