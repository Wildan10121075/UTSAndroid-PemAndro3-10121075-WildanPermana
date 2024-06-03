package com.wildan.utsandroid_pemandro3_10121075_wildanpermana

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.view.Gravity
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog

// Wildan Permana - 10121075
// PemAndro3 - 3 Juni 2024
class OutputData : AppCompatActivity() {

    // Wildan Permana - 10121075
    // PemAndro3 - 3 Juni 2024
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_output_data)

        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar) // Set the toolbar as the app bar

        // Set the title of the toolbar
        supportActionBar?.title = "Data"

        // Enable the back button on the toolbar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        // Set click listener for back button
        toolbar.setNavigationOnClickListener {
            onBackPressed()
        }

        // Get values from intent
        //Wildan Permana - 10121075
        val date = intent.getStringExtra("DATE")
        val nik = intent.getStringExtra("NIK")
        val nama = intent.getStringExtra("NAMA")
        val birth = intent.getStringExtra("BIRTH")
        val tes = intent.getStringExtra("TES")
        val kelamin = intent.getStringExtra("KELAMIN")
        val hubungan = intent.getStringExtra("HUBUNGAN")

        // Set values to TextViews
        //Wildan Permana - 10121075
        findViewById<TextView>(R.id.txt_date).text = date
        findViewById<TextView>(R.id.txt_nik).text = nik
        findViewById<TextView>(R.id.txt_nama).text = nama
        findViewById<TextView>(R.id.txt_birth).text = birth
        findViewById<TextView>(R.id.txt_tes).text = tes
        findViewById<TextView>(R.id.txt_kelamin).text = kelamin
        findViewById<TextView>(R.id.txt_hubungan).text = hubungan

        findViewById<Button>(R.id.btn_cek_hasil).setOnClickListener {
            //Wildan Permana - 10121075
            val dialogView = layoutInflater.inflate(R.layout.activity_popup, null)
            val dialog = AlertDialog.Builder(this)
                .setView(dialogView)
                .setCancelable(false) // Make it non-cancelable if desired
                .create()

            dialog.window?.attributes?.windowAnimations = R.style.DialogAnimation

            // Find the OK button in the dialog and set the click listener
            dialogView.findViewById<Button>(R.id.btn_ok).setOnClickListener {
                dialog.dismiss() // Dismiss the dialog when OK is clicked
            }

            dialog.show()

            //Wildan Permana - 10121075
            val window = dialog.window
            window?.setLayout(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
            window?.setGravity(Gravity.BOTTOM)
            window?.setBackgroundDrawableResource(android.R.color.transparent)

        }
        // Temukan tombol "Ubah" berdasarkan ID
        //Wildan Permana - 10121075
        val btnUbah: Button = findViewById(R.id.btn_ubah)

        // Tambahkan listener klik ke tombol "Ubah"
        //Wildan Permana - 10121075
        btnUbah.setOnClickListener {
            // Buat Intent untuk memulai ActivityMain
            val intent = Intent(this, MainActivity::class.java)

            // Mulai ActivityMain
            startActivity(intent)
        }

    }

}