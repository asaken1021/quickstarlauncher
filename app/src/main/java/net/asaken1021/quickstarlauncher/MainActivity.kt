package net.asaken1021.quickstarlauncher

import android.content.ComponentName
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val qsintent: Intent = Intent()

        qsintent.setAction(Intent.ACTION_VIEW)
        qsintent.setComponent(ComponentName("com.samsung.android.qstuner", "com.samsung.android.qstuner.QsTunerActivity"))

        startActivity(qsintent)
    }
}