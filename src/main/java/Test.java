import java.util.Arrays;

import static java.lang.String.*;

public class Test {
    public static void main(String[] args) {
        // http://vits.development.openshift.sdntest.netcracker.com/documents/20306/21984/Azure+Default+Price+file/e374debf-5a3a-461a-9b12-c2315e33e49d?version=8.0&download=true
//        System.out.println(getContentFileEntryLink(20306, 21984, "Azure Default Price file", "e374debf-5a3a-461a-9b12-c2315e33e49d"));
        System.out.println(Arrays.toString("&lt;![CDATA[/documents/20306/21984/Azure+Default+Price+file/e374debf-5a3a-461a-9b12-c2315e33e49d]]".split("\\W^ -")));
    }

    private static String getContentFileEntryLink(long groupId, long folderId, String title, String uuid) {
        final String plusedFileName = Arrays.stream(title.split(" ")).reduce((s, s2) -> s + "+" + s2).get();
        return format("<![CDATA[/documents/%s/%s/%s/%s]]", groupId, folderId, plusedFileName, uuid);
    }

}
