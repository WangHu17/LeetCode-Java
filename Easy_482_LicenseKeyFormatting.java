/**
 * @author wanghu
 * @discrption：
 * 您将获得一个表示为字符串 s 的许可证密钥，该字符串仅由字母数字字符和破折号组成。
 * 字符串被 n 个破折号分成 n + 1 个组。还给你一个整数 k。
 * 我们想要重新格式化字符串 s，使得每个组都包含恰好 k 个字符，除了第一个组，它可能比 k 短但仍然必须包含至少一个字符。
 * 此外，必须在两个组之间插入一个破折号，并且您应该将所有小写字母转换为大写字母。 返回重新格式化的许可证密钥。
 * @create 2021-10-20 9:59
 */
public class Easy_482_LicenseKeyFormatting {

    //我的方法
    //Runtime: 9 ms, faster than 85.53% of Java online submissions for License Key Formatting.
    //Memory Usage: 38.9 MB, less than 94.02% of Java online submissions for License Key Formatting.
    public String licenseKeyFormatting(String s, int k) {
        String s1 = s.replace("-", "").toUpperCase();
        if (s1.length() == 0 || k == 0) return s1;
        StringBuilder builder = new StringBuilder();
        int i = s1.length() - 1, k1 = 0;
        while (i >= 0) {
            builder.append(s1.charAt(i--));
            k1++;
            if (k1 == k) {
                builder.append('-');
                k1 = 0;
            }
        }
        String res = builder.reverse().toString();
        if (res.length() > 0 && res.charAt(0) == '-') res = res.substring(1);
        return res;
    }

}
