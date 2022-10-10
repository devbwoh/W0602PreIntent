package kr.ac.kumoh.prof.w0602preintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.ac.kumoh.prof.w0602preintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var view: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        view = ActivityMainBinding.inflate(layoutInflater)
        setContentView(view.root)

        view.btnExplicitIntent.setOnClickListener {
            val intent = Intent(this, ImageActivity::class.java)
            startActivity(intent)
        }

        view.btnImplicitIntent.setOnClickListener {
            val uri = Uri.parse("https://www.youtube.com/results?search_query="
                    + view.editText.text.toString())
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

        //view.btnHome.setOnClickListener {
        //    val uri = Uri.parse("http://bwoh.github.io")
        //    val intent = Intent(Intent.ACTION_VIEW, uri)
        //    startActivity(intent)
        //}
        //
        //view.btnMap.setOnClickListener {
        //    val uri = Uri.parse("geo:36.145014,128.393047?z=17")
        //    val intent = Intent(Intent.ACTION_VIEW, uri)
        //    startActivity(intent)
        //}
        //
        //view.btnTel.setOnClickListener {
        //    //val uri = Uri.parse("tel:025551234")
        //    val uri = Uri.parse("sms:025551234")
        //    val intent = Intent(Intent.ACTION_VIEW, uri)
        //
        //    if (intent.resolveActivity(packageManager) != null)
        //        startActivity(intent)
        //}
    }
}
