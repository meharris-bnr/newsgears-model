package com.lostsidewalk.buffy.discovery;

import com.lostsidewalk.buffy.post.ContentObject;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class ThumbnailedFeedDiscovery implements Serializable {

    public static final long serialVersionUID = 213492340123L;

    Long id;
    String feedUrl;
    Integer httpStatusCode;
    String httpStatusMessage;
    String redirectFeedUrl;
    Integer redirectHttpStatusCode;
    String redirectHttpStatusMessage;
    ContentObject title;
    ContentObject description;
    String feedType;
    String author;
    String copyright;
    String docs;
    String encoding;
    String generator;
    ThumbnailedFeedDiscoveryImage image;
    ThumbnailedFeedDiscoveryImage icon;
    String language;
    String link;
    String managingEditor;
    Date publishedDate;
    String styleSheet;
    List<String> supportedTypes;
    String webMaster;
    String uri;
    List<String> categories;
    List<FeedDiscoverySampleItem> sampleEntries;
    boolean isUrlUpgradable;

    ThumbnailedFeedDiscovery(
            Long id,
            String feedUrl,
            Integer httpStatusCode,
            String httpStatusMessage,
            String redirectFeedUrl,
            Integer redirectHttpStatusCode,
            String redirectHttpStatusMessage,
            ContentObject title,
            ContentObject description,
            String feedType,
            String author,
            String copyright,
            String docs,
            String encoding,
            String generator,
            ThumbnailedFeedDiscoveryImage image,
            ThumbnailedFeedDiscoveryImage icon,
            String language,
            String link,
            String managingEditor,
            Date publishedDate,
            String styleSheet,
            List<String> supportedTypes,
            String webMaster,
            String uri,
            List<String> categories,
            List<FeedDiscoverySampleItem> sampleEntries,
            boolean isUrlUpgradable) {
        this.id = id;
        this.feedUrl = feedUrl;
        this.httpStatusCode = httpStatusCode;
        this.httpStatusMessage = httpStatusMessage;
        this.redirectFeedUrl = redirectFeedUrl;
        this.redirectHttpStatusCode = redirectHttpStatusCode;
        this.redirectHttpStatusMessage = redirectHttpStatusMessage;
        this.title = title;
        this.description = description;
        this.feedType = feedType;
        this.author = author;
        this.copyright = copyright;
        this.docs = docs;
        this.encoding = encoding;
        this.generator = generator;
        this.image = image;
        this.icon = icon;
        this.language = language;
        this.link = link;
        this.managingEditor = managingEditor;
        this.publishedDate = publishedDate;
        this.styleSheet = styleSheet;
        this.supportedTypes = supportedTypes;
        this.webMaster = webMaster;
        this.uri = uri;
        this.categories = categories;
        this.sampleEntries = sampleEntries;
        this.isUrlUpgradable = isUrlUpgradable;
    }

    public static ThumbnailedFeedDiscovery from(FeedDiscoveryInfo feedDiscoveryInfo,
                                                        ThumbnailedFeedDiscoveryImage feedImage,
                                                        ThumbnailedFeedDiscoveryImage feedIcon) {
        return new ThumbnailedFeedDiscovery(
                feedDiscoveryInfo.getId(),
                feedDiscoveryInfo.getFeedUrl(),
                feedDiscoveryInfo.getHttpStatusCode(),
                feedDiscoveryInfo.getHttpStatusMessage(),
                feedDiscoveryInfo.getRedirectFeedUrl(),
                feedDiscoveryInfo.getRedirectHttpStatusCode(),
                feedDiscoveryInfo.getRedirectHttpStatusMessage(),
                feedDiscoveryInfo.getTitle(),
                feedDiscoveryInfo.getDescription(),
                feedDiscoveryInfo.getFeedType(),
                feedDiscoveryInfo.getAuthor(),
                feedDiscoveryInfo.getCopyright(),
                feedDiscoveryInfo.getDocs(),
                feedDiscoveryInfo.getEncoding(),
                feedDiscoveryInfo.getGenerator(),
                feedImage,
                feedIcon,
                feedDiscoveryInfo.getLanguage(),
                feedDiscoveryInfo.getLink(),
                feedDiscoveryInfo.getManagingEditor(),
                feedDiscoveryInfo.getPublishedDate(),
                feedDiscoveryInfo.getStyleSheet(),
                feedDiscoveryInfo.getSupportedTypes(),
                feedDiscoveryInfo.getWebMaster(),
                feedDiscoveryInfo.getUri(),
                feedDiscoveryInfo.getCategories(),
                feedDiscoveryInfo.getSampleEntries(),
                feedDiscoveryInfo.isUrlUpgradable()
        );
    }
}
