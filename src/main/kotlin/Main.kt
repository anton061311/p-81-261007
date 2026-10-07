package com.back

import java.nio.file.Files
import java.nio.file.StandardCopyOption

class File{}

fun main() {
    Files.copy(File("a.txt").toPath(), File("a_copy.txt").toPath(), StandardCopyOption.REPLACE_EXISTING)
}