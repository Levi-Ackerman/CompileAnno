package ngwebview.ninegame.cn.compileanno;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.Logger;
import com.example.MyAnno;

@Logger(id = 1,name = "main",type = "log")
public class MainActivity extends AppCompatActivity {

    @MyAnno("onCreate")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
