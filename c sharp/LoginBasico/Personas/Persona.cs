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
        public String ingresarDatos(Persona persona, String mostrar) {

            using (var con = conex.ConexionBD())
            {
                if (con == null)
                {
                    //Console.WriteLine("Fallo la conexión con la base de datos.");
                    return mostrar = "Fallo la conexión con la base de datos.";
                }

                try
                {

                    string query = "INSERT INTO persona (nombre, email, contrasenia) VALUES (@nombre, @email, @contrasenia);";

                    using (var cmd = new MySqlCommand(query, con))
                    {
                        cmd.Parameters.AddWithValue("@nombre", Nombre);
                        cmd.Parameters.AddWithValue("@email", Email);
                        cmd.Parameters.AddWithValue("@contrasenia", Pass);

                        cmd.ExecuteNonQuery();
                        //Console.WriteLine("DATOS INGRESADOS");
                        return mostrar = "Datos ingresados correctamente";
                    }
                }
                catch (MySqlException e)
                {
                    //Console.WriteLine("ERROR AL INGRESAR LOS DATOS" + e.Message);
                    return mostrar = "ERROR AL INGRESAR LOS DATOS";
                }
                finally
                {
                    con.Close();
                }



            }

        }

        public String compararLogin(String emailLogin , String passLogin) {

            using (var con = conex.ConexionBD()) {

                try
                {
                    String query = "SELECT email FROM persona WHERE email = @Email AND contrasenia = @Contrasenia";

                    using (var cmd = new MySqlCommand(query, con))
                    {

                        cmd.Parameters.AddWithValue("@email", emailLogin);
                        cmd.Parameters.AddWithValue("@contrasenia", passLogin);

                        using (var reader = cmd.ExecuteReader())
                        {

                            if (reader.Read())
                            {
                                return "USUARIO ENCONTRADO.";

                            }
                            else
                            {
                                return "USUARIO NO ENCONTRADO.";
                            }

                        }

                    }

                }
                catch (MySqlException ex)
                {
                    return "ERROR EN LA CONEXION." + ex.StackTrace;
                }
                finally {

                    con.Close();
                }
                
            }
        }

        }
    }