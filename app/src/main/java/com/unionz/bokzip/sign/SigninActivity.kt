package com.unionz.bokzip.sign

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.unionz.bokzip.R
import com.unionz.bokzip.home.MainActivity
import kotlinx.android.synthetic.main.activity_signin.*

class SigninActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        setListener()
    }

    private fun setListener() {
        kakao.setOnClickListener {
        }

        google.setOnClickListener {
            startActivity(Intent(this, WebViewActivity::class.java))
        }

        browsing.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}