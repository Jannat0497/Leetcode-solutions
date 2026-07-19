# 1567. Maximum Number of Vowels in a Substring of Given Length

**Difficulty:** Medium

Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.

Vowel letters in English are &#39;a&#39;, &#39;e&#39;, &#39;i&#39;, &#39;o&#39;, and &#39;u&#39;.

 
Example 1:


Input: s = &quot;abciiidef&quot;, k = 3
Output: 3
Explanation: The substring &quot;iii&quot; contains 3 vowel letters.


Example 2:


Input: s = &quot;aeiou&quot;, k = 2
Output: 2
Explanation: Any substring of length 2 contains 2 vowels.


Example 3:


Input: s = &quot;leetcode&quot;, k = 3
Output: 2
Explanation: &quot;lee&quot;, &quot;eet&quot; and &quot;ode&quot; contain 2 vowels.


 
Constraints:


	1 <= s.length <= 105
	s consists of lowercase English letters.
	1 <= k <= s.length
