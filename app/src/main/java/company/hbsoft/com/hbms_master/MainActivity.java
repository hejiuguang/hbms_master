package company.hbsoft.com.hbms_master;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import company.hbsoft.com.hbms_master.activity.LoginActivity;
import company.hbsoft.com.hbms_master.bean.QuestionBean;

public class MainActivity extends AppCompatActivity
{
    private List<QuestionBean> mDate=new ArrayList<> ();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
    }


    //添加测试而已
    public void flyto(View view)
    {

        Toast.makeText (getApplicationContext (),"稍后就出来",Toast.LENGTH_SHORT).show ();

       startActivity (new Intent (this, LoginActivity.class));

    }


}
