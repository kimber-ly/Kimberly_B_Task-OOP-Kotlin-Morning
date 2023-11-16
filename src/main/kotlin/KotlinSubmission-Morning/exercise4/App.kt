package id.infinitelearning.KotlinSubmission.exercise4

import java.lang.IndexOutOfBoundsException

fun main() {
    val list1 = listOf("Ikhsan, Kimberly, Irfan, Faza, Dzikri", "Akatsuki Mobile")
    tryCatch(list1)
}
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini

fun tryCatch(list: List<String>){
    try {
        list[5]
    }catch (e: IndexOutOfBoundsException){
        println(e)
        println("This list only contains ${list.size} element(s).")
    }
}