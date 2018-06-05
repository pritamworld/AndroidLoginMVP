package com.pritesh.loginmvp.ui.login.model

/**
 * Created by pritesh.patel on 2017-11-28, 1:51 PM.
 * ADESA, Canada
 */
class LoginModel {
    fun requestLogin(userName: String, password: String): Boolean {
        // for sake of simplicity, this method returns boolean after
        // receiving a response from server

        return userName == "pritesh" && password == "pritesh"
    }
}
