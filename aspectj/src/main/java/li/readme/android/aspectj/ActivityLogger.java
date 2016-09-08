package li.readme.android.aspectj;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by August on 8/24/16.
 */
@Aspect
public class ActivityLogger {
  private static final String TAG = "ActivityLogger";

  @Pointcut("execution(* li.readme.android.scratch..*.*(..))")
  public void pointcutWithinPackage() {}

  @Pointcut("within(@li.readme.android.scratch.commons.log.Loggable *)")
  public void pointcutLoggable() {}

  @Pointcut("execution(* *.onCreate(..))" +
      " || execution(* *.onRestart(..))" +
      " || execution(* *.onStart(..))" +
      " || execution(* *.onResume(..))" +
      " || execution(* *.onPause(..))" +
      " || execution(* *.onStop(..))" +
      " || execution(* *.onDestroy(..))")
  public void pointcutLifecycleMethod() {}

  @Pointcut("execution(* *.finish(..))")
  public void pointcutFinish() {}

  @After("pointcutWithinPackage() && pointcutLoggable() && (pointcutLifecycleMethod() || " +
      "pointcutFinish())")
  public void onCallLifecycleMethod(JoinPoint joinPoint) throws Throwable {
    Log.i(TAG, "onCallLifecycleMethod: "
        + joinPoint.getTarget().getClass().getCanonicalName()
        + "." + joinPoint.getSignature().getName());
  }

}
