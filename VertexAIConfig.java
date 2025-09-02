package com.ai.genAi.config;

import com.google.cloud.vertexai.VertexAI;
import com.google.auth.oauth2.GoogleCredentials;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

public class VertexAIConfig {
	public VertexAI configureVertexAI() throws IOException {
		
		VertexAI vertexAI = null;
		GoogleCredentials creds = GoogleCredentials.fromStream(
			    new FileInputStream("C://GCloud/service-account.json")
			).createScoped(List.of("https://www.googleapis.com/auth/cloud-platform"));

			try {

				vertexAI = new VertexAI.Builder()
				        .setProjectId("refreshing-cat-468522-i4")
				        .setLocation("us-central1")
				        .setCredentials(creds)
				        .build();
			}catch(Exception ex) {
				
			}
			return vertexAI;

    }
    
}
