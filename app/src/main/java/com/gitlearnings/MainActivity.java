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
  


        /*to merge master branch with development branch
        * 1)we need to switch the branch(destination branch)
        * 2)merge with source branch
        * EX: we have lot of code in development branch which is not in master branch.If we want to merge
        *       the master branch with development branch
        *       1)git checkout master
        *       2)git merge development
        * Ex 2: If we have 3 branches(A,B,C).If we want to get the code of A and B in Branch C..
              * 1)git checkout C
              * 2)git merge A and B
         */

    }
}
