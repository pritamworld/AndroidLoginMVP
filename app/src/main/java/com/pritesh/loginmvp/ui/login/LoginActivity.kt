package com.pritesh.loginmvp.ui.login

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.Toast
import com.pritesh.loginmvp.R
import com.pritesh.loginmvp.ui.login.presenter.LoginPresenter
import com.pritesh.loginmvp.ui.login.view.LoginView

//https://andhradroid.wordpress.com/2015/04/04/mvp-pattern-in-android/

class LoginActivity : AppCompatActivity(), LoginView {

    private var presenter: LoginPresenter? = null
    private val progress: ProgressBar? = null
    private val userNameEditText: EditText? = null
    private val passwordEditText: EditText? = null
    private var loginButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        presenter = LoginPresenter(this)

        loginButton = findViewById(R.id.btnLogin)
        loginButton?.setOnClickListener(onClickListener())
    }

    private fun onClickListener(): View.OnClickListener {
        return object : View.OnClickListener {
            override fun onClick(v: View) {
                val userName = userNameEditText?.text
                val password = passwordEditText?.text
                presenter?.onLoginClicked(userName.toString(), password.toString())
            }
        }
    }

    override fun showProgress() {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideProgress() {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showError(error: String) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show()
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
