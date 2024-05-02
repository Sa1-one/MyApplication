package first.sai.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import first.sai.myapplication.fragment.HomeFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.main, HomeFragment.newInstance())
            .commit()

        val apicall = ApiCall()
        apicall.execute()
    }
}