package org.DevProject.Album.payload.album;

import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AlbumViewDTO {

    private long id;

    @NotBlank
    @Schema(description = "Albums name", example = "Enjoyment", requiredMode = RequiredMode.REQUIRED)
    private String name;

    @NotBlank
    @Schema(description = "Albums Description", example = "Provide Description", requiredMode = RequiredMode.REQUIRED)
    private String description;

    private List<PhotoDTO> photos;
}
