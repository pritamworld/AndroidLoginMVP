package com.pritesh.loginmvp.ui.login.presenter;

import com.pritesh.loginmvp.ui.login.model.LoginModel;
import com.pritesh.loginmvp.ui.login.view.LoginView;

/**
 * Created by pritesh.patel on 2017-11-28, 2:11 PM.
 * ADESA, Canada
 */

public class LoginPresenter
{

    private LoginView loginView;
    private LoginModel loginModel;

    public LoginPresenter(LoginView loginView)
    {
        this.loginView = loginView;
        this.loginModel = new LoginModel();
    }

    public void onLoginClicked(String userName, String password)
    {

        if(isValidFormat(userName, password))
        {
            requestLoginFromModel(userName, password);
        } else
        {
            loginView.showError("invalid data");
        }
    }

    private boolean isValidFormat(String userName, String password)
    {
        return true;
    }

    private void requestLoginFromModel(String userName, String password)
    {

        loginView.showProgress();

        boolean success = loginModel.requestLogin(userName, password);

        loginView.hideProgress();

        if(success)
        {
            moveToNextScreen();
        } else
        {
            loginView.showError("login failed");
        }

    }

    private void moveToNextScreen()
    {

    }

}

