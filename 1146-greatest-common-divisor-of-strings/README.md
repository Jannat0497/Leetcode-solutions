# 1146. Greatest Common Divisor of Strings

**Difficulty:** Easy

For two strings s and t, we say &quot;t divides s&quot; if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

 
Example 1:


Input: str1 = &quot;ABCABC&quot;, str2 = &quot;ABC&quot;

Output: &quot;ABC&quot;


Example 2:


Input: str1 = &quot;ABABAB&quot;, str2 = &quot;ABAB&quot;

Output: &quot;AB&quot;


Example 3:


Input: str1 = &quot;LEET&quot;, str2 = &quot;CODE&quot;

Output: &quot;&quot;


Example 4:


Input: str1 = &quot;AAAAAB&quot;, str2 = &quot;AAA&quot;

Output: &quot;&quot;​​​​​​​


 
Constraints:


	1 <= str1.length, str2.length <= 1000
	str1 and str2 consist of English uppercase letters.
