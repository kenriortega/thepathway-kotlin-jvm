package utils

import kotlinx.coroutines.*
import java.util.*
import java.util.Timer

class Timer {
    companion object {

        @JvmStatic
        fun callPeriodically(ms: Long, block: () -> Unit) =
            Timer().scheduleAtFixedRate(object : TimerTask() {
                override fun run() {
                    block()
                }
            }, 0, ms)


        @JvmStatic
        suspend fun setInterval(timeMillis: Long, block: () -> Unit) =
            coroutineScope {
                launch {
                    while (true) {
                        delay(timeMillis)
                        block()
                    }
                }
            }
    }
}
