package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ShareVideoContent extends ShareContent<ShareVideoContent, Builder> implements ShareModel {
    public static final Creator<ShareVideoContent> CREATOR = new C86321();
    private final String contentDescription;
    private final String contentTitle;
    private final SharePhoto previewPhoto;
    private final ShareVideo video;

    public static final class Builder extends com.facebook.share.model.ShareContent.Builder<ShareVideoContent, Builder> {
        private String contentDescription;
        private String contentTitle;
        private SharePhoto previewPhoto;
        private ShareVideo video;

        public final Builder setContentDescription(String str) {
            this.contentDescription = str;
            return this;
        }

        public final Builder setContentTitle(String str) {
            this.contentTitle = str;
            return this;
        }

        public final Builder setPreviewPhoto(SharePhoto sharePhoto) {
            SharePhoto sharePhoto2;
            AppMethodBeat.m2504i(97613);
            if (sharePhoto == null) {
                sharePhoto2 = null;
            } else {
                sharePhoto2 = new com.facebook.share.model.SharePhoto.Builder().readFrom(sharePhoto).build();
            }
            this.previewPhoto = sharePhoto2;
            AppMethodBeat.m2505o(97613);
            return this;
        }

        public final Builder setVideo(ShareVideo shareVideo) {
            AppMethodBeat.m2504i(97614);
            if (shareVideo == null) {
                AppMethodBeat.m2505o(97614);
            } else {
                this.video = new com.facebook.share.model.ShareVideo.Builder().readFrom(shareVideo).build();
                AppMethodBeat.m2505o(97614);
            }
            return this;
        }

        public final ShareVideoContent build() {
            AppMethodBeat.m2504i(97615);
            ShareVideoContent shareVideoContent = new ShareVideoContent(this, null);
            AppMethodBeat.m2505o(97615);
            return shareVideoContent;
        }

        public final Builder readFrom(ShareVideoContent shareVideoContent) {
            AppMethodBeat.m2504i(97616);
            if (shareVideoContent == null) {
                AppMethodBeat.m2505o(97616);
                return this;
            }
            this = ((Builder) super.readFrom((ShareContent) shareVideoContent)).setContentDescription(shareVideoContent.getContentDescription()).setContentTitle(shareVideoContent.getContentTitle()).setPreviewPhoto(shareVideoContent.getPreviewPhoto()).setVideo(shareVideoContent.getVideo());
            AppMethodBeat.m2505o(97616);
            return this;
        }
    }

    /* renamed from: com.facebook.share.model.ShareVideoContent$1 */
    static class C86321 implements Creator<ShareVideoContent> {
        C86321() {
        }

        public final ShareVideoContent createFromParcel(Parcel parcel) {
            AppMethodBeat.m2504i(97610);
            ShareVideoContent shareVideoContent = new ShareVideoContent(parcel);
            AppMethodBeat.m2505o(97610);
            return shareVideoContent;
        }

        public final ShareVideoContent[] newArray(int i) {
            return new ShareVideoContent[i];
        }
    }

    /* synthetic */ ShareVideoContent(Builder builder, C86321 c86321) {
        this(builder);
    }

    private ShareVideoContent(Builder builder) {
        super((com.facebook.share.model.ShareContent.Builder) builder);
        AppMethodBeat.m2504i(97620);
        this.contentDescription = builder.contentDescription;
        this.contentTitle = builder.contentTitle;
        this.previewPhoto = builder.previewPhoto;
        this.video = builder.video;
        AppMethodBeat.m2505o(97620);
    }

    ShareVideoContent(Parcel parcel) {
        super(parcel);
        AppMethodBeat.m2504i(97621);
        this.contentDescription = parcel.readString();
        this.contentTitle = parcel.readString();
        com.facebook.share.model.SharePhoto.Builder readFrom = new com.facebook.share.model.SharePhoto.Builder().readFrom(parcel);
        if (readFrom.getImageUrl() == null && readFrom.getBitmap() == null) {
            this.previewPhoto = null;
        } else {
            this.previewPhoto = readFrom.build();
        }
        this.video = new com.facebook.share.model.ShareVideo.Builder().readFrom(parcel).build();
        AppMethodBeat.m2505o(97621);
    }

    public final String getContentDescription() {
        return this.contentDescription;
    }

    public final String getContentTitle() {
        return this.contentTitle;
    }

    public final SharePhoto getPreviewPhoto() {
        return this.previewPhoto;
    }

    public final ShareVideo getVideo() {
        return this.video;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        AppMethodBeat.m2504i(97622);
        super.writeToParcel(parcel, i);
        parcel.writeString(this.contentDescription);
        parcel.writeString(this.contentTitle);
        parcel.writeParcelable(this.previewPhoto, 0);
        parcel.writeParcelable(this.video, 0);
        AppMethodBeat.m2505o(97622);
    }

    static {
        AppMethodBeat.m2504i(97623);
        AppMethodBeat.m2505o(97623);
    }
}
