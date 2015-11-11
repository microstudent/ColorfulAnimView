# ColorfulAnimView
这是一个根据模仿google的新logo所做出来的动画。

![](http://7xo6vj.com1.z0.glb.clouddn.com/15-11-12/44412013.jpg)

![](http://7xo6vj.com1.z0.glb.clouddn.com/15-11-12/86761997.jpg)

这动画是重写View的onDraw方法做成的。

可以嵌套在大部分布局之中。

1.允许调整动画的速度。

2.支持小圆根据长宽自动匹配大小。

3.支持wrap_content

#用法
      <com.microstudent.app.colorfulanimview.ColorfulAnimView
          android:layout_marginLeft="14dp"
          android:layout_marginRight="14dp"
          android:id="@+id/view_anim"
          android:layout_width="100dp"
          android:layout_height="match_parent"
          app:speed_factor="0.8"
          />
          
  因为是第一次提交作品，因此肯定存在很多错误，有什么意见建议请和我提一下，谢谢。
  
  欢迎fork，改进这个动画。
  
