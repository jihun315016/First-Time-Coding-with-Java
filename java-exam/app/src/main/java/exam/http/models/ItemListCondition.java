package exam.http.models;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ItemListCondition {
    private String ttbkey;

    private String queryType;

    private String cover;

    private int maxResult;

    private int start;

    private String searchTarget;

    private String output;

    private String version;
}

