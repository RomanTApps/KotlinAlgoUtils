package romantsisyk.github.io.lib.algorithms.text_processing

class VowelCounter {
    fun countVowels(input: String): Int {
        val vowels = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
        return input.count { it in vowels }
    }
}
