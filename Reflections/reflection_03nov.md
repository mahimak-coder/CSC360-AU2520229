# Reflection: Digital Image Representation, Image Processing, Histograms and Image Analysis – 03-11-2026
## 1. Topics Covered

The following topics were covered and explored during the lectures and additional reading:

1. Introduction to Digital Images
2. Image Formation and Image Representation
3. Pixels, Resolution and Image Dimensions
4. Raster and Vector Images
5. Different Image Formats (JPEG, PNG, GIF, BMP, TIFF and SVG)
6. Lossy and Lossless Image Compression
7. RGB Colour Model
8. Alpha Channel, RGBA and Transparency
9. Colour Depth and Bit Depth
10. Binary Representation of Image Data
11. Bits Within a Byte
12. Big Endian and Little Endian
13. Image Storage and Memory Representation
14. Grayscale Images and Intensity Levels
15. Image Histograms and Their Interpretation
16. Brightness, Contrast and Dynamic Range
17. Histogram Equalization and Histogram Normalization
18. Image Thresholding and Segmentation
19. Image Filters and Convolution
20. Blur, Sharpening and Edge Detection
21. Image Noise and Noise Reduction
22. Image Processing and Its Real-World Applications
23. Introduction to ImageJ Software
24. Image Analysis Using ImageJ
25. ImageJ Tools, Measurements and Plugins
26. Image Processing Using JavaFX
27. Image Transmission, Binary Data and Wi-Fi
28. Applications of Digital Image Processing in Science, Medicine and Technology

---

## 2. Detailed Explanation of Topics

### 2.1 Introduction to Digital Images

We started by understanding what digital images actually are and how computers represent them. A digital image is not simply a picture stored inside a computer. It is a collection of numerical values that represent the visual information of an image.

An image is made up of small individual elements called pixels (picture elements). Each pixel contains information about its colour or intensity. When millions of these pixels are arranged together, they form the complete image that we see on our screens.

I also explored how digital images are used in different areas, such as photography, medical imaging, satellite images, security systems, computer vision and social media.

This helped me understand that the same basic concept of pixels is used in many different technologies.

### 2.2 Image Formation and Image Representation

One interesting concept connected to digital images is image formation. In the real world, light reflects from objects and enters a camera or another imaging device. The sensor captures this light and converts it into electrical signals, which are then processed to produce a digital image.

I learned that converting a real-world image into a digital form involves two important processes:

- **Sampling:** Dividing the image into a grid of pixels. It determines the spatial resolution of the image.
- **Quantization:** Assigning numerical intensity or colour values to those pixels.

For example, when a camera captures a photograph, it converts continuous visual information into discrete pixels and numerical values.

This process is important because computers cannot directly process the real-world image as we see it. They need a digital representation of that information.

### 2.3 Pixels, Resolution and Image Dimensions

A pixel is the smallest individual element of a digital raster image. Every pixel contributes to the overall appearance of the image.

Resolution refers to the number of pixels used to represent an image. For example, an image with dimensions of 1920 × 1080 contains 2,073,600 pixels.

I also understood the difference between image dimensions and image resolution. Dimensions tell us the number of pixels horizontally and vertically, while resolution can also refer to pixel density, such as PPI (Pixels Per Inch), depending on the context.

A higher pixel count generally allows more image detail, although the actual quality also depends on factors such as focus, sensor quality and compression.

This concept is useful in photography, printing, digital displays and image editing.

### 2.4 Raster and Vector Images

We also explored two major ways of representing images: raster graphics and vector graphics.

**Raster Images:** These images consist of a fixed grid of pixels. Photographs and scanned documents are common examples. When enlarged too much, raster images can become pixelated because the individual pixels become visible.

**Vector Images:** These are created using mathematical descriptions of shapes, lines, curves and paths. They can be resized without losing their sharpness.

For example, photographs are generally stored as raster images, whereas logos, icons and illustrations are often created using vector graphics.

This helped me understand why different types of images require different formats and methods of storage.

### 2.5 Different Image Formats

An important part of the discussion was understanding different image formats and why we use them.

Different formats store image information in different ways. Some focus on reducing file size, while others preserve image quality or support transparency and animation.

**JPEG / JPG**

JPEG is commonly used for photographs and images with many colours. It uses lossy compression, which means some image information is removed to reduce the file size.

It is useful for:
- Digital photography
- Websites
- Social media uploads
- Sharing photographs

However, repeatedly saving a JPEG image with lossy compression can reduce its quality.

**PNG**

PNG uses lossless compression, meaning the original pixel information can be preserved without the losses associated with JPEG compression. It also supports transparency through an alpha channel.

It is useful for:
- Logos
- Icons
- Screenshots
- Images with transparent backgrounds
- Graphics containing text

**GIF**

GIF supports a limited colour palette and can store multiple frames to create simple animations.

It is commonly used for:
- Simple animations
- Small moving graphics
- Basic web animations

**BMP**

BMP is a bitmap format that stores image data in a relatively straightforward manner. Depending on its configuration, it may store uncompressed image data, which can result in larger file sizes.

**TIFF**

TIFF is particularly important in professional photography, scanning, publishing and scientific imaging. It can support high-quality image storage and different compression methods.

**SVG**

SVG is a vector image format. Unlike JPEG and PNG, it represents graphics using shapes and mathematical paths instead of a fixed grid of pixels.

It is useful for:
- Web icons
- Logos
- Diagrams
- Scalable illustrations

Understanding these formats helped me realise that selecting an image format depends on what the image will be used for.

### 2.6 Lossy and Lossless Compression

Image compression is used to reduce the storage space required by an image.

There are two major types:

**Lossy Compression:** Some image information is permanently removed to reduce the file size. JPEG is a common example. Although the file becomes smaller, excessive compression can reduce image quality.

**Lossless Compression:** The image can be compressed without permanently losing its original information. PNG is a common example.

I also explored why compression matters in websites, mobile applications and cloud storage. Smaller image files generally require less storage and less data to transfer over a network.

### 2.7 RGB Colour Model

We studied the RGB colour model, which stands for Red, Green and Blue.

These three colour channels are used by digital displays to create different colours through additive colour mixing.

In the common 8-bit representation, each channel has a value between 0 and 255.

For example:

- RGB (255, 0, 0) represents Red.
- RGB (0, 255, 0) represents Green.
- RGB (0, 0, 255) represents Blue.
- RGB (0, 0, 0) represents Black.
- RGB (255, 255, 255) represents White.

By combining different values of these three channels, a display can produce millions of different colours.

I also explored how RGB differs from CMYK. RGB is mainly used for digital displays, whereas CMYK is commonly used in colour printing.

### 2.8 Alpha Channel, RGBA and Transparency

Apart from RGB, we also discussed the alpha channel.

RGBA stands for Red, Green, Blue and Alpha. It contains four channels, where the alpha channel determines the opacity of a pixel.

In an 8-bit alpha channel:

- 0 means completely transparent.
- 255 means completely opaque.
- Values between 0 and 255 represent different levels of transparency.

For example, a transparent PNG logo can be placed over different backgrounds without displaying an unwanted rectangular background.

I found this concept useful because transparency is widely used in graphic design, application interfaces, games and web development.

### 2.9 Colour Depth and Bit Depth

Bit depth refers to the number of bits used to represent information about a pixel or an individual colour channel.

For example, an 8-bit grayscale image can represent 256 intensity levels, ranging from 0 to 255.

A standard 24-bit RGB image uses 8 bits for each of the three channels:

8 bits (Red) + 8 bits (Green) + 8 bits (Blue) = 24 bits.

This gives approximately 16.7 million possible colour combinations.

I also learned that scientific images sometimes use 16-bit or even 32-bit representations to preserve a wider range of intensity information. This is particularly useful when small differences in image intensity are important.

### 2.10 Binary Representation of Image Data

Since computers work with binary data, images are also represented using combinations of 0s and 1s.

Every pixel's colour or intensity information is ultimately stored as digital data.

For example, an 8-bit grayscale pixel can have a value between 0 and 255, and each of these values can be represented using eight binary digits.

This helped me connect image processing with computer memory and data representation.

### 2.11 Bits Within a Byte

We also discussed how bits are arranged within a byte.

One byte contains 8 bits, and each bit can have a value of either 0 or 1.

In conventional binary notation, the rightmost bit is the Least Significant Bit (LSB), while the leftmost bit is the Most Significant Bit (MSB).

The position of each bit determines its contribution to the overall numerical value.

I understood that bits are the basic building blocks of digital information, and they are used in image storage, networking and data processing.

### 2.12 Big Endian and Little Endian

Another topic was byte ordering, which explains how computers store multi-byte values in memory.

There are two common approaches:

**Big Endian:** The most significant byte is stored first.

**Little Endian:** The least significant byte is stored first.

For example, consider the hexadecimal number:

0x12345678

Its byte representation would be:

- Big Endian: 12 34 56 78
- Little Endian: 78 56 34 12

This concept is important when working with binary files, file formats, networking protocols and communication between different computer systems.

I also understood that byte ordering and the order of bits within an individual byte are separate concepts.

### 2.13 Image Storage and Memory Representation

I explored how images occupy memory depending on their dimensions, colour channels and bit depth.

For example, a 100 × 100 pixel image with 24-bit RGB representation requires:

100 × 100 × 3 = 30,000 bytes of raw pixel data.

This calculation does not include additional file headers, metadata or other storage overhead.

It helped me understand why high-resolution images require more storage and why compression is important.

### 2.14 Grayscale Images and Intensity Levels

A grayscale image contains different shades of grey rather than separate red, green and blue colour channels.

Each pixel represents an intensity value.

In an 8-bit grayscale image:
- 0 represents Black.
- 255 represents White.
- Values between them represent different shades of grey.

Grayscale images are particularly useful in medical imaging, document scanning, scientific research and image analysis.

I also explored how colour images can be converted into grayscale. One commonly used method calculates luminance using weighted contributions from the red, green and blue channels:

Gray = 0.299R + 0.587G + 0.114B

This gives more importance to green because human vision is more sensitive to green light than to blue light.

### 2.15 Image Histograms

One of the most interesting topics discussed was image histograms.

A histogram is a graphical representation of the distribution of pixel intensity values in an image.

For an 8-bit grayscale image, the histogram generally contains 256 intensity levels, from 0 to 255.

The horizontal axis represents intensity values, while the vertical axis represents the number of pixels having each intensity.

A histogram helps us understand the overall brightness and contrast of an image.

For example:

- A histogram concentrated towards the left indicates that the image contains more dark pixels.
- A histogram concentrated towards the right indicates that the image contains more bright pixels.
- A histogram spread across a wider range generally indicates a wider distribution of intensity values.

Histograms are not limited to grayscale images. Colour images can also have separate histograms for their red, green and blue channels.

I understood that histograms are useful because they provide information about an image without requiring us to inspect every pixel individually.

### 2.16 Brightness, Contrast and Dynamic Range

Histograms are closely connected to brightness and contrast.

**Brightness** refers to how light or dark an image appears. Increasing brightness generally shifts pixel intensities towards higher values, while decreasing brightness shifts them towards lower values.

**Contrast** refers to the difference between lighter and darker regions of an image. Low-contrast images may look dull, whereas high-contrast images show more noticeable differences between light and dark areas.

**Dynamic Range** refers to the range between the darkest and brightest information that an image can represent or capture.

A histogram can help identify whether an image uses only a small portion of its available intensity range.

These concepts are useful in photography, image enhancement, medical imaging and scientific analysis.

### 2.17 Histogram Equalization

Histogram equalization is an image enhancement technique used to improve contrast.

Sometimes an image contains pixel values concentrated within a small intensity range. This can make the image appear dull or unclear.

Histogram equalization redistributes intensity values to make better use of the available intensity range.

It is based on the cumulative distribution of pixel intensities.

For example, a low-contrast photograph can sometimes become clearer after histogram equalization because previously compressed intensity differences become more noticeable.

This technique is used in medical image enhancement, satellite image processing and computer vision.

However, it can also increase the visibility of noise, so it is not suitable for every image.

### 2.18 Histogram Normalization and Stretching

I also explored histogram normalization and contrast stretching.

Contrast stretching expands the range of pixel intensities so that darker and brighter regions become more distinguishable.

For example, if an image uses only intensity values between 50 and 180, contrast stretching can map those values across a wider range.

Histogram normalization and equalization are related enhancement techniques, but they are not exactly the same. Normalization generally rescales intensity values, whereas equalization uses the intensity distribution to redistribute them.

### 2.19 Image Thresholding and Segmentation

Thresholding is a technique used to separate objects from their backgrounds based on pixel intensity.

For example, if we select an intensity threshold of 128, pixels below the threshold can be classified as black and pixels above it as white.

This produces a binary image.

Thresholding is particularly useful in:
- Document scanning
- Object detection
- Medical image analysis
- Cell counting
- Identifying objects in scientific images

Segmentation is a broader process in which an image is divided into meaningful regions or objects.

Thresholding is one of the techniques that can be used to perform segmentation.

### 2.20 Image Filters and Convolution

We also explored different image filters and how they modify pixel values.

Filters are used to improve image quality, remove unwanted information or highlight specific features.

Some common filters include:

**Blur Filter:** Reduces sharp details and makes an image appear smoother.

**Sharpen Filter:** Makes edges and details more noticeable.

**Grayscale Filter:** Converts a coloured image into different shades of grey.

**Edge Detection:** Identifies boundaries between different regions in an image.

**Median Filter:** Helps remove certain types of noise while preserving edges better than a simple averaging filter.

I also explored convolution, which is a mathematical operation commonly used in image processing.

Convolution uses a small matrix called a kernel that moves across an image and calculates new pixel values using neighbouring pixels.

Different kernels can create different effects, such as blurring, sharpening and edge detection.

### 2.21 Image Noise and Noise Reduction

Image noise refers to unwanted variations in pixel values that can affect image quality.

Noise can occur due to low lighting, camera sensors, electronic interference or other limitations during image capture.

There are different types of noise, such as:

- Gaussian Noise
- Salt-and-Pepper Noise

Different filters can help reduce noise.

For example, a median filter is often useful for reducing salt-and-pepper noise, while Gaussian smoothing can reduce certain types of high-frequency noise.

This is especially important in medical imaging and scientific photography, where unwanted variations can affect the interpretation of an image.

### 2.22 Image Processing and Its Applications

Image processing involves performing operations on digital images to improve them or extract useful information.

I explored how image processing is used in several fields:

- **Medical Imaging:** Analysing X-rays, MRI scans and CT scans.
- **Satellite Imaging:** Studying geographical areas, vegetation and environmental changes.
- **Security:** Processing images captured by surveillance systems.
- **Agriculture:** Identifying plant diseases and analysing crop conditions.
- **Photography:** Improving brightness, contrast, colours and sharpness.
- **Computer Vision:** Helping computers identify objects, patterns and visual information.

This showed me that image processing is not limited to editing photographs. It is also an important part of scientific research and automated systems.

### 2.23 Introduction to ImageJ

One additional tool I explored was ImageJ.

ImageJ is an image-processing and analysis software developed for scientific and research purposes. It is particularly popular in biology, microscopy, medical research and other areas where images need to be measured and analysed.

Unlike ordinary image-editing software, ImageJ is not only used to change how an image looks. It also allows users to extract numerical information from images.

Some important features of ImageJ include:

- Opening and displaying different image formats.
- Converting colour images into grayscale.
- Measuring image dimensions and pixel values.
- Viewing image histograms.
- Adjusting brightness and contrast.
- Applying different image filters.
- Performing thresholding and segmentation.
- Measuring areas, distances and intensity values.
- Analysing multiple images.
- Using plugins for additional functionality.

I found ImageJ interesting because it connects many of the concepts discussed in class with practical image analysis.

### 2.24 ImageJ: Histograms and Image Analysis

One of the most useful features of ImageJ is its histogram analysis.

The histogram tool allows users to examine how pixel intensity values are distributed throughout an image.

For example, if we open a grayscale image in ImageJ and select the histogram option, we can observe how many pixels have different intensity values.

This can help us identify whether an image is too dark, too bright or has low contrast.

ImageJ also allows users to examine histograms for individual colour channels in suitable colour images.

Another important feature is the ability to select a particular region of interest (ROI) and analyse only that part of an image.

For example, in a microscopic image, a researcher may want to measure the intensity of a particular cell instead of analysing the complete image.

This is useful in scientific research because it allows measurements to be made from specific regions rather than relying only on visual observation.

### 2.25 ImageJ: Filters, Measurements and Plugins

I also explored some of the other tools available in ImageJ.

**Filters:** ImageJ provides different filters that can be applied to images, including smoothing, sharpening, edge detection and noise reduction.

**Measurements:** It can measure area, mean intensity, standard deviation, minimum and maximum pixel values, and other properties depending on the selected image and measurement settings.

**Thresholding:** Users can select pixels within a particular intensity range to identify objects or regions.

**Plugins:** ImageJ supports additional plugins that extend its capabilities. These can be used for advanced image analysis, scientific measurements and automated processing.

For example, in biological research, ImageJ can help count cells, measure the size of microscopic structures and analyse fluorescence intensity.

This helped me understand that software tools can make image analysis more systematic and measurable.

### 2.26 ImageJ and Scientific Applications

ImageJ has several real-world applications.

In biology, it is used to analyse microscopic images and measure cells and tissues.

In medical research, it can help researchers study image intensity, identify regions and analyse different structures.

In neuroscience, it can be used to analyse brain images and microscopy data.

In material science, it can help measure particles, pores and structural features.

It is also useful in educational laboratories because students can experiment with image processing without needing to develop every operation from scratch.

### 2.27 Image Processing Using JavaFX

Through additional reading related to JavaFX, I explored how image processing can also be performed through programming.

JavaFX provides several classes for handling images:

- **Image:** Used to load an image from a file or another source.
- **ImageView:** Used to display an image in a JavaFX application.
- **PixelReader:** Used to read the colour values of individual pixels.
- **PixelWriter:** Used to modify pixel values.
- **WritableImage:** Used to create or modify an image programmatically.

For example, using PixelReader, a programmer can read the RGB value of a pixel. These values can then be modified to create effects such as grayscale conversion.

This connects the theoretical understanding of pixels and colour channels with actual programming.

### 2.28 Image Transmission, Binary Data and Wi-Fi

We also connected binary data with networking and wireless communication.

When we share an image through Wi-Fi or the internet, the image is represented as digital data. The data is organised into packets and transmitted through a communication system.

Wireless communication uses radio signals to transmit information between devices.

I explored how networking involves concepts such as binary representation, encoding, transmission and error detection.

This helped me understand that the same binary information used to represent images is also involved in transferring those images between computers and mobile devices.

---

## 3. Personal Reflection

This topic helped me understand digital images from a much deeper perspective. Before studying these concepts, I mostly thought of an image as something that we simply capture, save or edit. However, after learning about pixels, RGB values, alpha channels, bit depth and image formats, I realised how much information is actually involved in representing a single image.

I found the discussion about histograms particularly interesting because it showed me that an image can be understood through numerical data and not just by looking at it. Understanding brightness, contrast, intensity distribution and histogram equalization helped me see how image quality can be analysed and improved mathematically.

Exploring ImageJ was another useful part because it allowed me to connect the theoretical concepts with an actual software tool. Features such as histogram analysis, thresholding, filters, measurements and region selection showed me how digital images can be used for scientific research and practical analysis.

I also found the connection between image processing and JavaFX interesting because it showed how programming can be used to read and modify individual pixels. The topics related to binary representation, bit ordering and memory storage helped me understand what happens behind the scenes when a computer stores or processes an image.

Overall, I feel that these discussions helped me move beyond simply understanding images as visual objects. I now have a better idea of how images are formed, stored, processed, analysed and transmitted. It also made me more curious about the applications of image processing in areas such as medical science, computer vision, photography and scientific research.
