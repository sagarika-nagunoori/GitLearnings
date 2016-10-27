package com.gitlearnings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        development();
    }

    private void development() {
        /*we are in development branch*/

        /*create branch
        * git branch branchname*/

        /*switch to development branch
        * git checkout development*/

        /*add project
        * git add . */

        /*commit
        * git commit -m "message*/

        /*push the project
        * git push origin branchname
        * ex:git push origin master/develolpment*/

        Toast.makeText(this,"development",Toast.LENGTH_SHORT).show();

    }
}
