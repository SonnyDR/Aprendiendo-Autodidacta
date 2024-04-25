using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PracticandoBD
{
    class Conexion
    {
        MySqlConnection myCon = null;

        public MySqlConnection conexionBase()
        {

            try
            {
                string server = "localhost";
                string database = "FAMOSOS";
                string user = "root";
                string pwd = "alejoarias1";

                string cadenaConexion = "server=" + server + ";database=" + database + ";" + "User=" + user + ";pwd=" + pwd + ";";

                MySqlConnection myCon = new MySqlConnection(cadenaConexion);

                myCon.Open();
                Console.WriteLine("CONEXION EXITOSA.");
                return myCon;
            }
            catch (MySqlException e)
            {
                Console.WriteLine("ERROR EN LA CONEXION." + e.Message);
                return null;

            }

        }
    }
}
