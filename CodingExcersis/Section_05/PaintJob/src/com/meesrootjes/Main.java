package com.meesrootjes;

public class Main {

    public static void main(String[] args) {

    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0.0 || height <= 0.0 || areaPerBucket <= 0.0 || extraBuckets < 0.0) return -1;
        double wallArea = width * height;
        double extra = areaPerBucket * extraBuckets;
        wallArea -= extra;
        double buckets = wallArea / areaPerBucket;
        if (wallArea % areaPerBucket != 0) buckets++;
        return (int) buckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0.0 || height <= 0.0 || areaPerBucket <= 0.0) return -1;
        double wallArea = width * height;
        double buckets = wallArea / areaPerBucket;
        if (wallArea % areaPerBucket != 0) buckets++;
        return (int) buckets;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0.0 || areaPerBucket <= 0.0) return -1;
        double buckets = area / areaPerBucket;
        if (area % areaPerBucket != 0) buckets++;
        return (int) buckets;
    }
}
