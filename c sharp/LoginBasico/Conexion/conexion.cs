using System;
using MySql.Data.MySqlClient;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MySql.Data;

namespace Conexion
{
    public class conexion
    {
        // Método para abrir la conexión y devolverla
        public MySqlConnection ConexionBD()
        {
            // Configuración de la cadena de conexión
            string server = "localhost";
            string database = "login";
            string uid = "root";
            string password = "alejoarias1";

            string conn = $"server={server};database={database};uid={uid};password={password};";

            MySqlConnection connection = new MySqlConnection(conn);

            // Intentar abrir la conexión
            try
            {
                connection.Open();
                Console.WriteLine("Conexión exitosa.");
                return connection;
            }
            catch (MySqlException ex)
            {
                Console.WriteLine("Error al conectar: " + ex.StackTrace);
                return null;

            }

        }
    }
}