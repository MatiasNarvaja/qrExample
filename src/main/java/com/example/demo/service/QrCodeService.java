package com.example.demo.service;

public interface QrCodeService {
    byte[] generateQrCode(String qrCodeContent, int width, int height);
}