using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Conexion;
using MySql.Data.MySqlClient;

namespace Personas
{
    public class Persona
    {

        conexion conex = new conexion();

        private String nombre;
        private String email;
        private String pass;

        public Persona() {
        }

        public Persona(String nombre, String email, String pass) {
            this.nombre = nombre;
            this.email = email;
            this.pass = pass;
        }

        public string Nombre
        {
            get { return nombre; }
            set { nombre = value; }
        }

        public string Email
        {
            get { return email; }
            set { email = value; }
        }

        public string Pass
        {
            get { return pass; }
            set { pass = value; }
        }

        //METODO PARA INGRESAR DATOS A LA BASE DE DATOS
        public void ingresarDatos() {

            try
            {

                using (var con = conex.ConexionBD())
                {

                    string query = "INSERT INTO usuarios (nombre, email, contrasenia) VALUES (@nombre, @email, @contrasenia);";

                    if (con != null)
                    {

                        using (var cmd = new MySqlCommand(query, con))
                        {

                            cmd.Parameters.AddWithValue("@nombre", nombre);
                            cmd.Parameters.AddWithValue("@email", email);
                            cmd.Parameters.AddWithValue("@contrasenia", pass);

                            cmd.ExecuteNonQuery();
                        }

                    }

                    Console.WriteLine("Ingresador correctamente");

                }
            }
            catch(Exception e) {
                Console.WriteLine("Error a ingresar los datos" + e.Message);
            }

            

        }

    }
}
