package nextstep.subway.acceptance.constants;

public enum Endpoint {

    STATION_BASE_URL("/stations"),
    LINE_BASE_URL("/lines"),

    PATH_BASE_URL("/paths");

    private final String url;

    Endpoint(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

}
