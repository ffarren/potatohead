package com.example.potatohead

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var ivhead: ImageView
    private lateinit var ivhair: ImageView
    private lateinit var ivmoustache: ImageView
    private lateinit var iveyes: ImageView
    private lateinit var iveyebrow: ImageView
    private lateinit var ivbeard: ImageView

    private lateinit var cbhead: CheckBox
    private lateinit var cbhair: CheckBox
    private lateinit var cbmoustache: CheckBox
    private lateinit var cbeyes: CheckBox
    private lateinit var cbeyebrow: CheckBox
    private lateinit var cbbeard: CheckBox


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ivhead = findViewById(R.id.iv_head)
        ivhair = findViewById(R.id.iv_hair)
        ivmoustache = findViewById(R.id.iv_moustache)
        iveyes = findViewById(R.id.iv_eyes)
        iveyebrow = findViewById(R.id.iv_eyebrow)
        ivbeard = findViewById(R.id.iv_beard)

        cbhead = findViewById(R.id.cb_head)
        cbhair = findViewById(R.id.cb_hair)
        cbmoustache = findViewById(R.id.cb_moustache)
        cbeyes = findViewById(R.id.cb_eyes)
        cbeyebrow = findViewById(R.id.cb_eyebrow)
        cbbeard = findViewById(R.id.cb_beard)

        cbhead.setOnClickListener {
            ivhead.toggleVisibility()
        }

        cbhair.setOnClickListener {
            ivhair.toggleVisibility()
        }

        cbmoustache.setOnClickListener {
            ivmoustache.toggleVisibility()
        }

        cbeyes.setOnClickListener {
            iveyes.toggleVisibility()
        }

        cbeyebrow.setOnClickListener {
            iveyebrow.toggleVisibility()
        }

        cbbeard.setOnClickListener {
            ivbeard.toggleVisibility()
        }

    }

    fun View.toggleVisibility() {
        if (visibility == View.VISIBLE) {
            visibility = View.INVISIBLE
        } else {
            visibility = View.VISIBLE
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putBoolean("statuscbhead", cbhead.isChecked)
        outState.putBoolean("statuscbhair", cbhair.isChecked)
        outState.putBoolean("statuscbmoustache", cbmoustache.isChecked)
        outState.putBoolean("statuscbeyes", cbeyes.isChecked)
        outState.putBoolean("statuscbeyebrow", cbeyebrow.isChecked)
        outState.putBoolean("statuscbbeard", cbbeard.isChecked)

        outState.putInt("statusivhead",ivhead.visibility)
        outState.putInt("statusivhair", ivhair.visibility)
        outState.putInt("statusivmoustache", ivmoustache.visibility)
        outState.putInt("statusiveyes", iveyes.visibility)
        outState.putInt("statusiveyebrow", iveyebrow.visibility)
        outState.putInt("statusivbeard", ivbeard.visibility)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        cbhead.setChecked(savedInstanceState.getBoolean("statuscbhead"))
        cbhair.setChecked(savedInstanceState.getBoolean("statuscbhair"))
        cbmoustache.setChecked(savedInstanceState.getBoolean("statuscbmoustache"))
        cbeyes.setChecked(savedInstanceState.getBoolean("statuscbeyes"))
        cbeyebrow.setChecked(savedInstanceState.getBoolean("statuscbeyebrow"))
        cbbeard.setChecked(savedInstanceState.getBoolean("statuscbbeard"))

        ivhead.setVisibility(savedInstanceState.getInt("statusivhead"))
        ivhair.setVisibility(savedInstanceState.getInt("statusivhair"))
        ivmoustache.setVisibility(savedInstanceState.getInt("statusivmoustache"))
        iveyes.setVisibility(savedInstanceState.getInt("statusiveyes"))
        iveyebrow.setVisibility(savedInstanceState.getInt("statusiveyebrow"))
        ivbeard.setVisibility(savedInstanceState.getInt("statusivbeard"))
    }

}