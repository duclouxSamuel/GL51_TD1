package gl51.service

import gl51.data.Picture

interface PictureThumbnailService {
    Picture makeThumbnail()
}