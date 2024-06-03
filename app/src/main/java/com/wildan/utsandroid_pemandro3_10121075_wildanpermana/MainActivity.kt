package com.wildan.utsandroid_pemandro3_10121075_wildanpermana

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

// Wildan Permana - 10121075
// PemAndro3 - 3 Juni 2024
class MainActivity : AppCompatActivity() {

    private lateinit var etDate: EditText
    private lateinit var etNik: EditText
    private lateinit var etNama: EditText
    private lateinit var etBirth: EditText
    private lateinit var rgTes: RadioGroup
    private lateinit var rgKelamin: RadioGroup
    private lateinit var rgHubungan: RadioGroup
    private lateinit var btnNext: Button

    // Wildan Permana - 10121075
    // PemAndro3 - 3 Juni 2024
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        etDate = findViewById(R.id.et_date)
        etNik = findViewById(R.id.et_nik)
        etNama = findViewById(R.id.et_nama)
        etBirth = findViewById(R.id.et_birth)
        rgTes = findViewById(R.id.rbg_3)
        rgKelamin = findViewById(R.id.rbg_1)
        rgHubungan = findViewById(R.id.rbg_2)
        btnNext = findViewById(R.id.btn_next)

        btnNext.setOnClickListener {
            // Get values from views
            val date = etDate.text.toString()
            val nik = etNik.text.toString()
            val nama = etNama.text.toString()
            val birth = etBirth.text.toString()

            val selectedTesId = rgTes.checkedRadioButtonId
            val selectedKelaminId = rgKelamin.checkedRadioButtonId
            val selectedHubunganId = rgHubungan.checkedRadioButtonId

            val tes = findViewById<RadioButton>(selectedTesId).text.toString()
            val kelamin = findViewById<RadioButton>(selectedKelaminId).text.toString()
            val hubungan = findViewById<RadioButton>(selectedHubunganId).text.toString()


            // Create Intent to start ActivityOutputData
            val intent = Intent(this, OutputData::class.java).apply {
                putExtra("DATE", date)
                putExtra("NIK", nik)
                putExtra("NAMA", nama)
                putExtra("BIRTH", birth)
                putExtra("TES", tes)
                putExtra("KELAMIN", kelamin)
                putExtra("HUBUNGAN", hubungan)
            }
            startActivity(intent)
        }
    }
}