package dev.zt64.compose.pdf.sample

import androidx.core.net.toFile
import com.mohamedrejeb.calf.io.KmpFile
import dev.zt64.compose.pdf.LocalPdfState

actual fun LocalPdfState(file: KmpFile): LocalPdfState {
    return LocalPdfState(file.uri.toFile())
}