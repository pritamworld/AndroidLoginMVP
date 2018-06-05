package com.pritesh.loginmvp.ui.login.view

/**
 * Created by pritesh.patel on 2017-11-28, 1:51 PM.
 * ADESA, Canada
 */
interface LoginView {
    fun showProgress()
    fun hideProgress()
    fun showError(error: String)
}
