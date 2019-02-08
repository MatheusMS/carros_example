package com.example.carros.extensions

import android.app.Activity
import android.support.annotation.IdRes
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast

fun AppCompatActivity.onClick(@IdRes viewId: Int, onClick: (v: android.view.View?) -> Unit) {
    val view = findViewById<View>(viewId)
    view.setOnClickListener { onClick(it) }
}

fun Activity.toast(message: CharSequence, length: Int = Toast.LENGTH_SHORT) =
    Toast.makeText(this, message, length).show()