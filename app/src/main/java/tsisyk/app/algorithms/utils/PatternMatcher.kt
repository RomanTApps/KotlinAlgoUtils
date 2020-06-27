package tsisyk.app.algorithms.utils

class PatternMatcher {
    fun kmpSearch(text: String, pattern: String): List<Int> {
        val lps = computeLPSArray(pattern)
        val positions = mutableListOf<Int>()
        var i = 0
        var j = 0

        while (i < text.length) {
            if (pattern[j] == text[i]) {
                j++
                i++
            }
            if (j == pattern.length) {
                positions.add(i - j)
                j = lps[j - 1]
            } else if (i < text.length && pattern[j] != text[i]) {
                if (j != 0) j = lps[j - 1]
                else i++
            }
        }
        return positions
    }

    private fun computeLPSArray(pattern: String): IntArray {
        val lps = IntArray(pattern.length)
        var length = 0
        var i = 1

        while (i < pattern.length) {
            if (pattern[i] == pattern[length]) {
                length++
                lps[i] = length
                i++
            } else {
                if (length != 0) {
                    length = lps[length - 1]
                } else {
                    lps[i] = 0
                    i++
                }
            }
        }
        return lps
    }
}
