# ARCore Augmented Faces wrapper sample

## Simple usage:

```
<androidx.fragment.app.FragmentContainerView android:name="com.ar.arfaces.arface.AugmentedFaceFragment"
        android:id="@+id/face_view"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_gravity="top" />
```
Use `AugmentedFaceFragment` in your `main_activity` layout

Implement interface in MainActivity

```
class MainActivity : AppCompatActivity(), AugmentedFaceListener {
   override fun onFaceAdded(face: AugmentedFaceNode) {}

   override fun onFaceUpdate(face: AugmentedFaceNode) {}
}
```
