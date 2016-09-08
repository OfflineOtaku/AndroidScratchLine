package li.readme.android.scratch.launchmode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import li.readme.android.scratch.R;
import li.readme.android.scratch.lifecycle.BaseActivity;

public class OtherTaskActivity extends BaseActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_other_task);
    findViewById(R.id.standard).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        startActivity(new Intent(OtherTaskActivity.this, StandardModeActivity.class));
      }
    });
    findViewById(R.id.standard_new_task).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        startActivity(new Intent(OtherTaskActivity.this, StandardModeActivity.class).addFlags
            (Intent.FLAG_ACTIVITY_NEW_TASK));
      }
    });
    findViewById(R.id.standard_new_task_allow_reparent).setOnClickListener(new View
        .OnClickListener() {
      @Override
      public void onClick(View v) {
        startActivity(new Intent(OtherTaskActivity.this, StandardModeWithAllowReparentActivity
            .class));
      }
    });
  }
}
