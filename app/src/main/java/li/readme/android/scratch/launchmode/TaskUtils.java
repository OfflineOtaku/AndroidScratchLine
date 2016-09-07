package li.readme.android.scratch.launchmode;

import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;

import java.util.List;

/**
 * Created by August on 9/7/16.
 */

public final class TaskUtils {
  private static final String TAG = "TaskUtils";

  private TaskUtils() {}

  public static void printCurrentTaskPreview(Context context) {
    ActivityManager activityManager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
    List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(Integer.MAX_VALUE);
    if (runningTasks != null && !runningTasks.isEmpty()) {
      for (ActivityManager.RunningTaskInfo runningTaskInfo : runningTasks) {
        Log.e(TAG, "printCurrentTaskPreview: " + runningTaskInfo.id);
      }
    }
  }
}
