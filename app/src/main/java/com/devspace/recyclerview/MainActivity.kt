package com.devspace.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val rvlist = findViewById<RecyclerView>(R.id.rv_list)
        val adapter = ContactListAdapter()

        rvlist.adapter = adapter
        rvlist.layoutManager = LinearLayoutManager(this)

        adapter.submitList(contacts)

    }
}

val contacts = listOf(
    Contact(
        "Roque",
        "+55(48) 99584-9856",
        R.drawable.sample10
    ),
    Contact(
        "Filipe",
        "+55(48) 99578-4876",
        R.drawable.sample9
    ),
    Contact(
        "Zulamar",
        "+55(48) 99365-7852",
        R.drawable.sample11
    ),
    Contact(
        "Jorge",
        "+55(48) 99632-3258",
        R.drawable.sample8
    ),
    Contact(
        "Léo",
        "+55(48) 99965-4774",
        R.drawable.sample14
    ),
    Contact(
        "Daiana",
        "+55(48) 99865-1245",
        R.drawable.sample16
    ),
    Contact(
        "Juli",
        "+55(48) 99632-8321",
        R.drawable.sample3
    ),
    Contact(
        "Luciana",
        "+55(48) 99563-8746",
        R.drawable.sample15
    ),
    Contact(
        "Rafael",
        "+55(48) 99896-7231",
        R.drawable.sample1
    ),
    Contact(
        "Francisco",
        "+55(48) 99369-5436",
        R.drawable.sample2
    ),
    Contact(
        "Lena",
        "+55(48) 99369-7410",
        R.drawable.sample4
    ),
    Contact(
        "Maza",
        "+55(48) 99203-0205",
        R.drawable.sample6
    ),
    Contact(
        "Karine",
        "+55(48) 99258-2014",
        R.drawable.sample7
    ),
    Contact(
        "Maria",
        "+55(48) 99698-6087",
        R.drawable.sample13
    ),
    Contact(
        "Chai",
        "+55(48) 99023-8745",
        R.drawable.sample5
    ),
    Contact(
        "Mario",
        "+55(48) 99584-9856",
        R.drawable.sample12
    ),
)