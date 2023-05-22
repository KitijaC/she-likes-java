package com.sda.she_likes_java.exceptions;

import java.time.LocalDateTime;
import java.util.Objects;

public class Secret {
    private final LocalDateTime timestamp;
    private final String ourSecret;

    public Secret(LocalDateTime timestamp, String ourSecret) {
        this.timestamp = timestamp;
        this.ourSecret = ourSecret;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Secret secret = (Secret) o;
        return Objects.equals(timestamp, secret.timestamp) && Objects.equals(ourSecret, secret.ourSecret);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, ourSecret);
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getOurSecret() {
        return ourSecret;
    }

    @Override
    public String toString() {
        return "Secret{" +
                "timestamp=" + timestamp +
                ", ourSecret='" + ourSecret + '\'' +
                '}';
    }
}
