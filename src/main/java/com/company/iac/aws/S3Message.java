package com.company.iac.aws;

import java.util.List;

public record S3Message(String bucketName, List<String> keys) {}