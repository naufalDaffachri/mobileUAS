package com.example.pertemuan5tugas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var username: EditText
    private lateinit var email: EditText
    private lateinit var phone: EditText
    private lateinit var password: EditText
    private lateinit var registerButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        username = findViewById(R.id.editUsername)
        email = findViewById(R.id.editEmail)
        phone = findViewById(R.id.editPhone)
        password = findViewById(R.id.editPassword)
        registerButton = findViewById(R.id.buttonRegister)

        registerButton.setOnClickListener {
            val user = username.text.toString()
            val mail = email.text.toString()
            val phoneNumber = phone.text.toString()
            val pass = password.text.toString()

            // Mengirim data ke LoginActivity
            val intent = Intent(this@MainActivity, LoginActivity::class.java)
            intent.putExtra("username", user)
            intent.putExtra("email", mail)
            intent.putExtra("phone", phoneNumber)
            intent.putExtra("password", pass)
            startActivity(intent)
        }
    }
}
