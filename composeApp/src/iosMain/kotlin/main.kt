import androidx.compose.ui.window.ComposeUIViewController
import com.devx.cmp.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }
