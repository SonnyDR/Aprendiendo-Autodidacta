namespace PracticandoBD
{
    partial class Form1
    {
        /// <summary>
        /// Variable del diseñador necesaria.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpiar los recursos que se estén usando.
        /// </summary>
        /// <param name="disposing">true si los recursos administrados se deben desechar; false en caso contrario.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código generado por el Diseñador de Windows Forms

        /// <summary>
        /// Método necesario para admitir el Diseñador. No se puede modificar
        /// el contenido de este método con el editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.button1 = new System.Windows.Forms.Button();
            this.lblnombre = new System.Windows.Forms.Label();
            this.lblfnaci = new System.Windows.Forms.Label();
            this.lblffalle = new System.Windows.Forms.Label();
            this.lblnacio = new System.Windows.Forms.Label();
            this.lblocupacion = new System.Windows.Forms.Label();
            this.lbllogro = new System.Windows.Forms.Label();
            this.lblId = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(302, 45);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(196, 48);
            this.button1.TabIndex = 0;
            this.button1.Text = "Informacion";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // lblnombre
            // 
            this.lblnombre.AutoSize = true;
            this.lblnombre.ForeColor = System.Drawing.Color.Red;
            this.lblnombre.Location = new System.Drawing.Point(108, 168);
            this.lblnombre.Name = "lblnombre";
            this.lblnombre.Size = new System.Drawing.Size(10, 13);
            this.lblnombre.TabIndex = 1;
            this.lblnombre.Text = ".";
            // 
            // lblfnaci
            // 
            this.lblfnaci.AutoSize = true;
            this.lblfnaci.ForeColor = System.Drawing.Color.Red;
            this.lblfnaci.Location = new System.Drawing.Point(108, 204);
            this.lblfnaci.Name = "lblfnaci";
            this.lblfnaci.Size = new System.Drawing.Size(10, 13);
            this.lblfnaci.TabIndex = 2;
            this.lblfnaci.Text = ".";
            // 
            // lblffalle
            // 
            this.lblffalle.AutoSize = true;
            this.lblffalle.ForeColor = System.Drawing.Color.Red;
            this.lblffalle.Location = new System.Drawing.Point(108, 245);
            this.lblffalle.Name = "lblffalle";
            this.lblffalle.Size = new System.Drawing.Size(10, 13);
            this.lblffalle.TabIndex = 3;
            this.lblffalle.Text = ".";
            // 
            // lblnacio
            // 
            this.lblnacio.AutoSize = true;
            this.lblnacio.ForeColor = System.Drawing.Color.Red;
            this.lblnacio.Location = new System.Drawing.Point(108, 279);
            this.lblnacio.Name = "lblnacio";
            this.lblnacio.Size = new System.Drawing.Size(10, 13);
            this.lblnacio.TabIndex = 4;
            this.lblnacio.Text = ".";
            // 
            // lblocupacion
            // 
            this.lblocupacion.AutoSize = true;
            this.lblocupacion.ForeColor = System.Drawing.Color.Red;
            this.lblocupacion.Location = new System.Drawing.Point(108, 316);
            this.lblocupacion.Name = "lblocupacion";
            this.lblocupacion.Size = new System.Drawing.Size(10, 13);
            this.lblocupacion.TabIndex = 5;
            this.lblocupacion.Text = ".";
            // 
            // lbllogro
            // 
            this.lbllogro.AutoSize = true;
            this.lbllogro.ForeColor = System.Drawing.Color.Red;
            this.lbllogro.Location = new System.Drawing.Point(108, 353);
            this.lbllogro.Name = "lbllogro";
            this.lbllogro.Size = new System.Drawing.Size(10, 13);
            this.lbllogro.TabIndex = 6;
            this.lbllogro.Text = ".";
            // 
            // lblId
            // 
            this.lblId.AutoSize = true;
            this.lblId.ForeColor = System.Drawing.Color.Red;
            this.lblId.Location = new System.Drawing.Point(108, 141);
            this.lblId.Name = "lblId";
            this.lblId.Size = new System.Drawing.Size(10, 13);
            this.lblId.TabIndex = 7;
            this.lblId.Text = ".";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.SystemColors.AppWorkspace;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.lblId);
            this.Controls.Add(this.lbllogro);
            this.Controls.Add(this.lblocupacion);
            this.Controls.Add(this.lblnacio);
            this.Controls.Add(this.lblffalle);
            this.Controls.Add(this.lblfnaci);
            this.Controls.Add(this.lblnombre);
            this.Controls.Add(this.button1);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.Label lblnombre;
        private System.Windows.Forms.Label lblfnaci;
        private System.Windows.Forms.Label lblffalle;
        private System.Windows.Forms.Label lblnacio;
        private System.Windows.Forms.Label lblocupacion;
        private System.Windows.Forms.Label lbllogro;
        private System.Windows.Forms.Label lblId;
    }
}

